package com.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Link: https://takeuforward.org/data-structure/n-meetings-in-one-room/

Problem Statement: There is one meeting room in a firm. 
You are given two arrays, start and end each of size N.
For an index ‘i’, start[i] denotes the starting time of the ith meeting while end[i]  will denote the ending time of the ith meeting. 
Find the maximum number of meetings that can be accommodated if only one meeting can happen in the room at a  particular time. 
Print the order in which these meetings will be performed.
*/
class Meeting {

	int start;
	int end;
	int pos;

	public Meeting(int start, int end, int pos) {
		super();
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
}

class meetingComparator implements Comparator<Meeting> {

	@Override
	public int compare(Meeting o1, Meeting o2) {
		if (o1.end < o2.end)
			return -1;
		else if (o1.end > o2.end)
			return 1;
		else if (o1.pos < o2.pos)
			return -1;
		else
			return 1;
	}

}

public class NMeetings {

	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int end[] = { 2, 4, 5, 7, 9, 9 };
		maxMeetings(start, end, start.length);
	}

	private static void maxMeetings(int[] start, int[] end, int n) {

		ArrayList<Meeting> al = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n; i++)
			al.add(new Meeting(start[i], end[i], i + 1));

		Collections.sort(al, new meetingComparator());

		int last = 0;

		ans.add(al.get(0).pos);
		last = al.get(0).end;

		for (int i = 1; i < n; i++) {

			if (al.get(i).start > last) {
				ans.add(al.get(i).pos);
				last = al.get(i).end;
			}
		}

		for (int i : ans)
			System.out.print(i + " ");
	}

}
