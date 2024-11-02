import java.util.*;

public class Graph_Intro {
    public static List<List<Integer>> createadjlist(int v, int[][] edges){
        List<List<Integer>> adjlist = new ArrayList<>(v);

        for(int i=0; i<v; i++){
            adjlist.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int a = edge[0];
            int u = edge[1];
            adjlist.get(a).add(u);
            adjlist.get(u).add(a);

        }

        return adjlist;
    }
}
