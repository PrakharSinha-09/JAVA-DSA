import java.util.*;

import javax.lang.model.element.Element;
public class customhashMap {

    static class HashMap<K,V>{
        private class  Node{
            K key;
            V value;
            Node(K key, V value)
            {
                this.key=key;
                this.value=value;
            }
        }

        private int n;           //total nodes
        private int N;          //buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("Unchecked")

        public HashMap()
        {
            this.N=4;
            this.buckets=new LinkedList[4];

            for(int i=0;i<4;i++)
            {
                this.buckets[i]=new LinkedList<>();
            }
        }


        private int hashFunction(K key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;                                     //to ensure bi does't becomes negative.
        }

        private int searchInLL(K key,int bi)
        {
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++)
            {
                if(ll.get(i).key==key)
                {
                    return i;
                }
            }
            return -1;
        }

        private void rehash()
        {
             LinkedList<Node> oldBucket[]=buckets;
             buckets=new LinkedList[N*2];
             
            for(int i=0;i<N*2;i++)
            {
                buckets[i]=new LinkedList<>();
            }             

             for(int i=0;i<oldBucket.length;i++)
             {
                 LinkedList<Node> ll=oldBucket[i];
                 for(int j=0;j<ll.size();j++)
                 {
                     Node node=ll.get(j);
                     put(node.key,node.value);
                 }
             }
        }

        public void put(K key,V value){
            int bi=hashFunction(key);                        //bi means bucket index(array index).
            int di=searchInLL(key,bi);                        //di means data index(index in linked list).

            if(di==-1)                     //means key doesn't exist
            {
                buckets[bi].add(new Node(key, value));
                n++;                      //increase the no. of node
            }
            else{                        //key exists
                Node node=buckets[bi].get(di);
                node.value=value;
            }

            double lambda=(double)n/N;
        }   
        
        public V get(K key)
        {
            int bi=hashFunction(key);                        //bi means bucket index(array index).
            int di=searchInLL(key,bi);                        //di means data index(index in linked list).

            if(di==-1)                     //means key doesn't exist
            {
                return null;                    //increase the no. of node
            }
            else{                        //key exists
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key)
        {
            int bi=hashFunction(key);                        //bi means bucket index(array index).
            int di=searchInLL(key,bi);                        //di means data index(index in linked list).

            if(di==-1)                     //means key doesn't exist
            {
                return false;                     //increase the no. of node
            }
            else{                        //key exists
                return true;
            }
        } 

        public V remove(K key)
        {
            int bi=hashFunction(key);                        //bi means bucket index(array index).
            int di=searchInLL(key,bi);

            if(di==-1)
            {
                return null;
            }
            else{
                Node node=buckets[bi].remove(di);         //go to bucket index, then goto is dataindex, call for its removal and then return
                n--;
                return node.value;
            }
        }

        public boolean isEmpty()
        {
            return n==0;
        }

        public ArrayList<K> keyset()
        {
            ArrayList<K> keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++)           //bucket index
            {
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++)             //data index
                {
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;

        }

    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",190);
        map.put("China",200);
        map.put("US",50);
        map.put("Srilanka",30);
        map.put("UAE",20);

        ArrayList<String> keys=map.keyset();
        for(int i=0;i<keys.size();i++)
        {
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }


    }

}
