#include <stdio.h>

#define MAX_NODES 100

typedef struct {
    int adj[MAX_NODES][MAX_NODES];
    int visited[MAX_NODES];
    int n;
} Graph;

void dfs(Graph *g, int node, int *stack, int *top) {
    g->visited[node] = 1; 
    for (int i = 0; i < g->n; i++) {
        if (g->adj[node][i] && !g->visited[i]) {
            dfs(g, i, stack, top);
        }
    }
    stack[(*top)++] = node; 
}

void topologicalSort(Graph *g) {
    if (g->n == 0) {
        printf("Graph has no vertices.\n");
        return;
    }

    int stack[MAX_NODES];
    int top = 0;

    for (int i = 0; i < g->n; i++) {
        g->visited[i] = 0;
    }

    for (int i = 0; i < g->n; i++) {
        if (!g->visited[i]) {
            dfs(g, i, stack, &top);
        }
    }

    printf("Topological Sort: ");
    for (int i = top - 1; i >= 0; i--) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}

void initGraph(Graph *g, int n) {
    g->n = n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            g->adj[i][j] = 0;
        }
    }
}

int main() {
    Graph g;
    int n;

    printf("How many vertices");
    scanf("%d", &n);
    
    initGraph(&g, 6);

    printf("Enter Adjacency of the graph:\n");
    for (int i=0; i<n;i++){
        for(int j=0; j<n; j++){
            scanf("%d", &g.adj[i][j]);
        }
    }

    topologicalSort(&g);

    return 0;
}