package read;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Items.Map;

import java.io.IOException;

//constructor for ConnectedBy_
class ConnectedBy_ {
    public int vertexNum;
    public ConnectedBy_ next;
    public ConnectedBy_(int vnum, ConnectedBy_ nbr) {
            this.vertexNum = vnum; //quadratic derivative of completing squares
            next = nbr; //ConnectedBy_s
    }
}

//constructor for Vertex 
class Vertex {
    String room;
    Double coordinates;
    ConnectedBy_ adjacentList;
    int capacity;
    Vertex(String room, ConnectedBy_ ConnectedBy_s, Double coordinates, int capacity) {
            this.room = room;
            this.adjacentList = ConnectedBy_s;
            this.coordinates = coordinates;
            this.capacity = capacity;
    }
}

public class Parser {
	 
    Vertex[] adjacentLists;  //array of adjacent lists
     
    public Parser(String file) throws FileNotFoundException {
         
        Scanner sc = new Scanner(new File(file));
         
        String ParserType = sc.next();
        
        /*Undirected graphs have edges that do not have a direction.
         * The edges indicate a two-way relationship, in that each edge can be traversed in both directions.
         * Directed graphs have edges with direction.
         */
        
        boolean undirected=true;
        if (ParserType.equals("directed")) {
            undirected=false;
        }
         
        adjacentLists = new Vertex[sc.nextInt()];  //
 
        // read vertices
        for (int v=0; v < adjacentLists.length; v++) {
            adjacentLists[v] = new Vertex(sc.next(), null, sc.nextDouble(), sc.nextInt());
        }
 
        // read edges
        while (sc.hasNext()) {
             
            // read vertex rooms and translate to vertex numbers
            int v1 = indexForroom(sc.next());
            int v2 = indexForroom(sc.next());
             
            // add v2 to front of v1's adjacency list and
            // add v1 to front of v2's adjacency list
            adjacentLists[v1].adjacentList = new ConnectedBy_(v2, adjacentLists[v1].adjacentList);
            if (undirected) {
                adjacentLists[v2].adjacentList = new ConnectedBy_(v1, adjacentLists[v2].adjacentList);
            }
        }
    }
    
    /* Compares the room field against the target and if match 
     * returns current index of array
     */
	
    int indexForroom(String room) {
        for (int v=0; v < adjacentLists.length; v++) {
            if (adjacentLists[v].room.equals(room)) {
                return v;
            }
        }
        return -1;
    }   
    
    /*prints the graph data in the console command line */
    
    
    public void updateFullnesses(Map map) {
        System.out.println();
        for (int v=0; v < adjacentLists.length; v++) {
            System.out.print(adjacentLists[v].room);
            for (ConnectedBy_ nbr=adjacentLists[v].adjacentList; nbr != null;nbr=nbr.next) {
                System.out.print(" --> " + adjacentLists[nbr.vertexNum].room);
            }
            System.out.println("\n");
        }
    }
    

    public static Map getMap() throws IOException{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parser input file room: "); //allows for different files to be read in
        String file = sc.nextLine();
        Parser Parser = new Parser(file);
        Map Map = new Map(file); // creates a new map 
		Parser.updateFullnesses(Map);
		return Map;
	}
}