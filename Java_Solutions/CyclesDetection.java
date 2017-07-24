package codes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class CyclesDetection {
	
	private Map<String,ArrayList<String>> adjListsMap;
	
	
	public CyclesDetection() {
		// TODO Auto-generated constructor stub
		adjListsMap = new HashMap<String,ArrayList<String>>();
	}
	
	public void addVertex(String c) {
		if(!adjListsMap.containsKey(c)){
			ArrayList<String> neighbors = new ArrayList<String>();
			adjListsMap.put(c,  neighbors);
		}
	}
	
	public String addEdge(String v, String w) {
		if(adjListsMap.get(v).contains(w)){
			return "1";
		}else{
			(adjListsMap.get(v)).add(w);
		}
		return "0";
	}

	
	public void showNeighbors(){
		for(String s : adjListsMap.keySet()){
			System.out.print(s+" : ");
			for(int i=0;i<adjListsMap.get(s).size();i++){
				System.out.print(adjListsMap.get(s).get(i)+" ");
			}
			System.out.println();
		}
		
	}
	
	public ArrayList<String> getNeighbor(String curr){
		return adjListsMap.get(curr);
	}
	
	public String implementDFS(){
		Deque<String> stack = new ArrayDeque<String>();
		Set<String> visited = new HashSet<String>();
		Map<String,String> parent = new HashMap<String,String>();
		Map.Entry<String,ArrayList<String>> entry=adjListsMap.entrySet().iterator().next();
		String s= entry.getKey();
		stack.push(s);
		visited.add(s);
		while(!stack.isEmpty()){
			String curr = stack.pop();
			if(getNeighbor(curr)!=null){
				for(String c: getNeighbor(curr)){
					if(visited.contains(c)&&!parent.get(curr).equals(c)){
						return "1";
					}else if(visited.contains(c)&&parent.get(curr).equals(c)){
						continue;
					}
					else{
						visited.add(c);
						parent.put(c, curr);
						stack.push(c);
					}
				}	
			}
			
		}
		return "0";
	}
	
	public void flushMap(){
		adjListsMap.clear();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclesDetection obj = new CyclesDetection();
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		char[] ans = new char[range];
		for(int i=0;i<range;i++){
			int count = sc.nextInt();
			for(int k=0;k<count;k++){
				String[] edges = sc.next().split("-");
				obj.addVertex(edges[0]);
				String edge1 = obj.addEdge(edges[0], edges[1]);
				obj.addVertex(edges[1]);
				String edge2 = obj.addEdge(edges[1], edges[0]);
				if(edge1.equals("1") || edge2.equals("1")){
					ans[i] = '1';
					break;
				}
			}
			if(ans[i]== '1' || ans[i] == '0'){
				obj.flushMap();
			}
			else{
				ans[i] = obj.implementDFS().charAt(0);
				obj.flushMap();
			}
			//obj.showNeighbors();
			
		}
		System.out.println(new String(ans).replaceAll("", " "));
	}


}
