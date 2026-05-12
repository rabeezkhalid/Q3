
import java.util.*;

public class Q_3 {
    private Map<String, List<String>> graph = new HashMap<>();
    private Set<String> visited = new HashSet<>();
    private Stack<String> stack = new Stack<>();

    void addEdge(String u, String v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>());
    }

    void dfsVisit(String node) {
        visited.add(node);
        for (String neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsVisit(neighbor);
            }
        }
        stack.push(node);
    }

    void topologicalSort() {
        List<String> allVertices = new ArrayList<>(graph.keySet());
        Collections.sort(allVertices);

        for (String v : allVertices) {
            if (!visited.contains(v)) {
                dfsVisit(v);
            }
        }

        System.out.print("  Topological Order:  ");
        List<String> result = new ArrayList<>();
        while (!stack.isEmpty()) result.add(stack.pop());
        System.out.print(String.join(" -> ", result));
    }
}