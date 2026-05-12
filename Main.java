//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("  Q3: TOPOLOGICAL SORT (DFS)");

    Q_3 g = new Q_3();

    String[][] edges = {
            {"m","q"}, {"m","r"}, {"m","x"},
            {"n","q"}, {"n","o"}, {"n","u"},
            {"o","r"}, {"o","s"}, {"o","v"},
            {"p","o"}, {"p","s"}, {"p","z"},
            {"q","t"},
            {"r","u"}, {"r","y"},
            {"s","r"},
            {"u","t"}, {"u","y"},
            {"v","w"}, {"v","x"},
            {"w","z"}
    };

    System.out.println("\n  Edges added:");
    for (String[] e : edges) {
        g.addEdge(e[0], e[1]);
        System.out.print("    " + e[0] + " -> " + e[1] + ", ");
    }

    System.out.println();
    g.topologicalSort();
}
