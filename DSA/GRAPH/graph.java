import java.util.ArrayList;
import java.util.HashMap;

//this is all about the graph
public class graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    // this is the function for add the vertex for the graph
    public boolean addVertex(String vertex) {

        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    // function for print the graph
    public void printGraph() {
        System.out.println(adjList);
    }

    // this is the function for add a edge in graph
    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;

        }
        return false;
    }

    // funciton for remove the edge between vertex
    public boolean remove(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    //function for remove the vertex from graph
    public boolean removeVertex(String vertex){
        if (adjList.get(vertex)== null) return false;
        for(String otherVertex : adjList.get(vertex)){
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }

    public static void main(String[] args) {
        graph myGraph = new graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("C", "D");

        // myGraph.remove("A", "B");
        myGraph.removeVertex("D");
        myGraph.printGraph();
    }

}