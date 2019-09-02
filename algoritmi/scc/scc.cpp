using namespace std;
#include <vector>
#include <iostream>
#include <queue>

struct Graph{
  int N;
  vector< vector<int> > g;
  vector<bool> visited;
  queue<int> q;
  Graph(int n){
    N=n;
    g.resize(N);
  }
  void addEdge(int a, int b){
    g[a].push_back(b);
  }
  void topsort_dfs(int i){
    visited[i] = true;
    for(int u : g[i]){
      if(!visited[u])
        topsort_dfs(u);
    }
    q.push(i);
  }
  void topsort(){
    visited.resize(N, false);
    for(int i=0; i<N; i++){
      if(!visited[i]){
        topsort_dfs(i);
      }
    }
  }
  void scc_dfs(vector<int> &cc, int i, int ccc){
    cc[i] = ccc;
    for(int u : g[i]){
      if(cc[u] < 0){
        scc_dfs(cc, u, ccc);
      }
    }
  }
  void scc(vector<int> &cc){
    cc.resize(N, -1);
    //topsort();
    for(int i = 0; i<N; i++) q.push(i);
    int ccc = 0;
    while(!q.empty()){
      int i = q.front();
      q.pop();
      if(cc[i] < 0){
        scc_dfs(cc, i, ccc++);
      }
    }
  }
};
int main(){
  int n, m, a, b;
  cin >> n >> m;
  Graph g(n);
  for(int i=0; i<m; i++){
    cin >> a >> b;
    g.addEdge(a, b);
  }
  vector<int> cc;
  g.scc(cc);
  cin >> n;
  for(int i=0; i<n; i++){
      cin >> a >> b;
      cout << (cc[a] == cc[b]) << endl;
  }
}
