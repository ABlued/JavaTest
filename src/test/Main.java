package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class Main {
	public static void main(String[] args) {

		String isHave;
		int n = 6;
		int[][] delivery = {{1,3,1},{3,5,0},{5,4,0},{2,5,0}};

		isHave = solution(n,delivery);
		System.out.println(isHave);
	}
	public static String solution(int n, int[][] delivery) {
		String answer = "";
		Set<Integer> haveSet = new HashSet<Integer>();
		Set<Integer> notHaveSet = new HashSet<Integer>();
		Set<Integer> unKnownSet= new HashSet<Integer>();
		for(int i = 0; i<delivery.length; i++) {
			if(delivery[i][2] == 1) {
				haveSet.add(delivery[i][0]);
				haveSet.add(delivery[i][1]);
			}
			else {
				Iterator<Integer> it  = haveSet.iterator();
				while(it.hasNext()) {
					if(it.next().equals(delivery[i][0])) {
						notHaveSet.add(delivery[i][1]);
						break;
					}
					else if(it.equals(delivery[i][1])) { 
						notHaveSet.add(delivery[i][0]);        	
						break;
					}
					else {
						Iterator<Integer> notHaveSetIt  = notHaveSet.iterator();
						while(notHaveSetIt.hasNext()) {
							if(!notHaveSetIt.next().equals(delivery[i][0])) {
								unKnownSet.add(delivery[i][0]);
							}
							if(!notHaveSetIt.equals(delivery[i][1])) {
								unKnownSet.add(delivery[i][1]);
							}
						}
					}
				}
			}
		}


		List haveList = new ArrayList<Integer>(haveSet);
		Collections.sort(haveList);
		List notHaveList = new ArrayList<Integer>(notHaveSet);
		Collections.sort(notHaveList);
		List unKnownSetList = new ArrayList<Integer>(unKnownSet);
		Collections.sort(unKnownSetList);
		List list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(i+1);
		}

		Iterator<Integer> listIt  = list.iterator();
		Iterator<Integer> haveListIt  = haveList.iterator();
		Iterator<Integer> notHaveListIt  = notHaveList.iterator();
		Iterator<Integer> unknonwListIt  = unKnownSetList.iterator();
		haveListIt.next();
		notHaveListIt.next();
		unknonwListIt.next();
		while(listIt.hasNext()) {

			listIt.next();
			if(haveListIt.equals(listIt)) {
				answer = answer.concat("o");
				if(haveListIt.hasNext()) {
					haveListIt.next();
				}
				continue;
			}

			if(notHaveListIt.equals(listIt)) {
				answer = answer.concat("x");
				if(notHaveListIt.hasNext()) {
					notHaveListIt.next();
				}
				continue;
			}

			if(unknonwListIt.equals(listIt)) {
				answer = answer.concat("?");
				if(unknonwListIt.hasNext()) {
					unknonwListIt.next();
				}			continue;
			}
		}

		System.out.println(answer);
		return answer;
	}
}
