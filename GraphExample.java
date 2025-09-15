import java.util.*;

/**
 * Ejemplo completo de implementación de grafos
 * Incluye diferentes representaciones y algoritmos básicos
 */
public class GraphExample {
    
    // ========== REPRESENTACIÓN 1: LISTA DE ADYACENCIA ==========
    static class Graph {
        private int vertices;
        private List<List<Integer>> adjacencyList;
        
        public Graph(int vertices) {
            this.vertices = vertices;
            this.adjacencyList = new ArrayList<>();
            
            // Inicializar listas vacías para cada vértice
            for (int i = 0; i < vertices; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }
        
        // Agregar arista no dirigida
        public void addEdge(int source, int destination) {
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source); // Grafo no dirigido
        }
        
        // Agregar arista dirigida
        public void addDirectedEdge(int source, int destination) {
            adjacencyList.get(source).add(destination);
        }
        
        // Imprimir el grafo
        public void printGraph() {
            System.out.println("=== REPRESENTACIÓN DEL GRAFO ===");
            for (int i = 0; i < vertices; i++) {
                System.out.print("Vértice " + i + " está conectado con: ");
                for (Integer neighbor : adjacencyList.get(i)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }
    
    // ========== REPRESENTACIÓN 2: MATRIZ DE ADYACENCIA ==========
    static class GraphMatrix {
        private int[][] adjacencyMatrix;
        private int vertices;
        
        public GraphMatrix(int vertices) {
            this.vertices = vertices;
            this.adjacencyMatrix = new int[vertices][vertices];
        }
        
        public void addEdge(int source, int destination) {
            adjacencyMatrix[source][destination] = 1;
            adjacencyMatrix[destination][source] = 1; // Grafo no dirigido
        }
        
        public void printMatrix() {
            System.out.println("\n=== MATRIZ DE ADYACENCIA ===");
            System.out.print("  ");
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < vertices; j++) {
                    System.out.print(adjacencyMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    // ========== ALGORITMOS DE BÚSQUEDA ==========
    
    /**
     * Búsqueda en Anchura (BFS) - Breadth First Search
     * Encuentra el camino más corto en grafos no ponderados
     */
    public static void bfs(Graph graph, int startVertex) {
        System.out.println("\n=== BFS DESDE VÉRTICE " + startVertex + " ===");
        
        boolean[] visited = new boolean[graph.vertices];
        Queue<Integer> queue = new LinkedList<>();
        
        visited[startVertex] = true;
        queue.offer(startVertex);
        
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            
            // Visitar todos los vecinos no visitados
            for (Integer neighbor : graph.adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }
    
    /**
     * Búsqueda en Profundidad (DFS) - Depth First Search
     * Explora lo más profundo posible antes de retroceder
     */
    public static void dfs(Graph graph, int startVertex) {
        System.out.println("\n=== DFS DESDE VÉRTICE " + startVertex + " ===");
        
        boolean[] visited = new boolean[graph.vertices];
        dfsRecursive(graph, startVertex, visited);
        System.out.println();
    }
    
    private static void dfsRecursive(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        
        for (Integer neighbor : graph.adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsRecursive(graph, neighbor, visited);
            }
        }
    }
    
    /**
     * DFS Iterativo usando Stack
     */
    public static void dfsIterative(Graph graph, int startVertex) {
        System.out.println("\n=== DFS ITERATIVO DESDE VÉRTICE " + startVertex + " ===");
        
        boolean[] visited = new boolean[graph.vertices];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(startVertex);
        
        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            
            if (!visited[currentVertex]) {
                visited[currentVertex] = true;
                System.out.print(currentVertex + " ");
                
                // Agregar vecinos al stack (en orden inverso para mantener orden)
                List<Integer> neighbors = graph.adjacencyList.get(currentVertex);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    if (!visited[neighbors.get(i)]) {
                        stack.push(neighbors.get(i));
                    }
                }
            }
        }
        System.out.println();
    }
    
    // ========== EJEMPLO PRÁCTICO: LABERINTO ==========
    
    /**
     * Convierte un laberinto 2D en un grafo
     * Cada celda libre se convierte en un vértice
     */
    public static Graph mazeToGraph(int[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;
        
        // Contar celdas libres para determinar número de vértices
        int freeCells = 0;
        int[][] cellToVertex = new int[rows][cols];
        
        // Asignar números de vértice a celdas libres
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == 0) { // 0 = celda libre
                    cellToVertex[i][j] = freeCells++;
                } else {
                    cellToVertex[i][j] = -1; // -1 = pared
                }
            }
        }
        
        Graph graph = new Graph(freeCells);
        
        // Conectar celdas adyacentes
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == 0) { // Solo procesar celdas libres
                    int currentVertex = cellToVertex[i][j];
                    
                    // Verificar vecinos (arriba, abajo, izquierda, derecha)
                    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
                    
                    for (int[] dir : directions) {
                        int newRow = i + dir[0];
                        int newCol = j + dir[1];
                        
                        if (newRow >= 0 && newRow < rows && 
                            newCol >= 0 && newCol < cols && 
                            maze[newRow][newCol] == 0) {
                            
                            int neighborVertex = cellToVertex[newRow][newCol];
                            graph.addEdge(currentVertex, neighborVertex);
                        }
                    }
                }
            }
        }
        
        return graph;
    }
    
    // ========== MÉTODO PRINCIPAL ==========
    public static void main(String[] args) {
        System.out.println("🎯 APRENDIENDO GRAFOS - EJEMPLO COMPLETO\n");
        
        // Crear un grafo de ejemplo
        Graph graph = new Graph(6);
        
        // Agregar aristas para formar un grafo conectado
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        
        // Mostrar representaciones
        graph.printGraph();
        
        GraphMatrix graphMatrix = new GraphMatrix(6);
        graphMatrix.addEdge(0, 1);
        graphMatrix.addEdge(0, 2);
        graphMatrix.addEdge(1, 3);
        graphMatrix.addEdge(2, 4);
        graphMatrix.addEdge(3, 5);
        graphMatrix.addEdge(4, 5);
        graphMatrix.printMatrix();
        
        // Ejecutar algoritmos de búsqueda
        bfs(graph, 0);
        dfs(graph, 0);
        dfsIterative(graph, 0);
        
        // Ejemplo de laberinto
        System.out.println("\n=== EJEMPLO DE LABERINTO ===");
        int[][] maze = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}
        };
        
        System.out.println("Laberinto original:");
        for (int[] row : maze) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "█" : " ");
            }
            System.out.println();
        }
        
        Graph mazeGraph = mazeToGraph(maze);
        System.out.println("\nGrafo del laberinto:");
        mazeGraph.printGraph();
        
        System.out.println("\nBFS en el laberinto:");
        bfs(mazeGraph, 0);
    }
}
