import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
import java.util.StringTokenizer; 
class Graph{
         int V,far,value;
         ArrayList<Integer> al[];
         Graph(int v)
           {
              V=v; 
              al=new ArrayList[V+1];
              far=Integer.MIN_VALUE;
              value=0;
              for(int i=0;i<=v;i++)
              {
                  al[i]=new ArrayList<Integer>();
              }
           }
           
         public void addEdge(int from, int to)
            {
                al[from].add(to);
                al[to].add(from);
            }
            
            public int farthest(int root, int length, boolean Visited[])
            {
                Visited[root]=true;
                if(length>far)
                  {
                      far=length;
                      value=root;
                  }
                  for(int i=0;i<al[root].size();i++)
                  {   int x=al[root].get(i);
                      if(!Visited[x])
                        {
                            farthest(x,length+1,Visited);
                        }
                  }
                  return value;
            }
            public int largestDistance(int root, int length, boolean Visited[])
            {
                Visited[root]=true;
                if(length>far)
                  {
                      far=length;
                      value=root;
                  }
                  for(int i=0;i<al[root].size();i++)
                  {   int x=al[root].get(i);
                      if(!Visited[x])
                        {
                            largestDistance(x,length+1,Visited);
                        }
                  }
                  return far;
            }
     }
class Main
{     
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
     
	public static void main(String[] args) {
		try{
		Reader sc=new Reader();
		int N=sc.nextInt();
	    Graph g=new Graph(N);
	    for(int i=0;i<N-1;i++)
	       {   int from=sc.nextInt(); int to=sc.nextInt();
	           g.addEdge(from,to);
	       }
	       boolean visit[]=new boolean[N+1];
	       boolean visit1[]=new boolean[N+1];
		 System.out.print(g.largestDistance(g.farthest(1,0,visit),0,visit1));
		}catch(Exception e) {e.printStackTrace();}
	}
}