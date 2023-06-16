public class findShortestPath {
    //to find the shortest path eg NSEWES direction then find the displacement
    //concept[ N = y+1; S = y-1;E = x+1; W = x-1] ...draw the diagram to simplify the concept
    public static double getShortestPath(String path)
    { int x= 0,y=0;
        for(int i = 0; i< path.length();i++)
        {
            char dir = path.charAt(i);
            if (dir =='s')
            y--;
            else if(dir=='n')
            y++;
            else if(dir=='e')
            x++;
            else if(dir == 'w')
            x--;
            else 
            continue;
        }
        return Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path = "nnwswnnerrw";
        System.out.println(getShortestPath(path));
    }
    
}
