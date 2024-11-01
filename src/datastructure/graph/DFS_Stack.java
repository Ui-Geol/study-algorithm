package datastructure.graph;

import java.util.Stack;

public class DFS_Stack {
    static boolean[] visited = new boolean[9];

    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    public static void main(String[] args) {
        dfs(1);
    }

    public static void dfs(int startNode) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);
        visited[startNode] = true;

        while(!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(node + " ");

            for (int neighbor : graph[node]) {
                if( !visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }
}
