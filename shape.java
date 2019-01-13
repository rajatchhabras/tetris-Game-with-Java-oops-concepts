package project;

public class shape {
point p; 
char value;
int type;
int c_pos;
int[][][] rotate = {
		
        {
         {0,0},{-1,1},{-2,2},{-3,3},
         {3,3},{2,2},{1,1},{0,0},
         {-3,-3},{-2,-2},{-1,-1},{0,0} ,
         {0,0},{1,-1},{2,-2},{3,-3} 
         },
         {
        	 {0,2},{1,1},{2,0},{0,0},
             {2,-2},{1,-1},{0,0},{0,0},
             {-2,0},{-1,-1},{0,-2},{0,0} ,
             {0,0},{-1,1},{-2,2},{0,0} 
         },
         {
        	 {0,2},{-1,1},{-2,0},{-1,-1},
        	 {2,-1},{1,0},{0,1},{-1,0},
        	 {0,-2},{1,-1},{2,0},{1,1},
        	 {-2,1},{-1,0},{0,-1},{1,0} 
         },
         {
        	 {0,1},{1,0},{-1,0},{0,-1},
        	 {1,0},{0,-1},{0,1},{-1,0},
        	 {0,-1},{-1,0},{1,0},{0,1},
        	 {-1,0},{0,1},{0,-1},{1,0}  
         },
         {
        	 {0,1},{1,0},{0,-1},{1,-2},
        	 {1,1},{0,0},{-1,1},{-2,0},
        	 {1,-2},{0,-1},{1,0},{0,1},
        	 {-2,0},{-1,1},{0,0},{1,1}  
         },
         {
        	 {0,1},{-1,0},{0,-1},{-1,-2},
        	 {2,0},{1,1},{0,0},{-1,1},
        	 {-1,-2},{0,-1},{-1,0},{0,1},
        	 {-1,1},{0,0},{1,1},{2,0}  
         },
          
        
};
shape()
{
	
}
public void getshape(char c,int t,int ce)
{
	 p=new point();
    value=c;
	type=t; 
	c_pos=ce;
	switch(type)
	{
	case 0:
	{
		
		p.Arr[0][0]=1;
	    p.Arr[0][1]=20;
		p.Arr[1][0]=2;
		p.Arr[1][1]=20;
	    p.Arr[2][0]=3;
		p.Arr[2][1]=20;
		p.Arr[3][0]=4;
        p.Arr[3][1]=20;
       
		break;														
	}
	case 1:
	{
	
		p.Arr[0][0]=1;
	    p.Arr[0][1]=18;
		p.Arr[1][0]=1;
		p.Arr[1][1]=19;
	    p.Arr[2][0]=1;
		p.Arr[2][1]=20;
		p.Arr[3][0]=2;
        p.Arr[3][1]=19;
       
		break;														
	}
	case 2:
	{
	
		p.Arr[0][0]=1;
	    p.Arr[0][1]=20;
		p.Arr[1][0]=2;
		p.Arr[1][1]=20;
	    p.Arr[2][0]=3;
		p.Arr[2][1]=20;
		p.Arr[3][0]=3;
        p.Arr[3][1]=21;
      
		break;														
	}
	case 3:
	{
		
		p.Arr[0][0]=1;
	    p.Arr[0][1]=20;
		p.Arr[1][0]=1;
		p.Arr[1][1]=21;
	    p.Arr[2][0]=2;
		p.Arr[2][1]=20;
		p.Arr[3][0]=2;
        p.Arr[3][1]=21;
      
		break;														
	}
	
	case 4:
	{
	
		p.Arr[0][0]=1;
	    p.Arr[0][1]=20;
		p.Arr[1][0]=1;
		p.Arr[1][1]=21;
	    p.Arr[2][0]=2;
		p.Arr[2][1]=21;
		p.Arr[3][0]=2;
        p.Arr[3][1]=22;
      
		break;														
	}
	case 5:
	{
	
		p.Arr[0][0]=1;
	    p.Arr[0][1]=20;
		p.Arr[1][0]=2;
		p.Arr[1][1]=20;
	    p.Arr[2][0]=2;
		p.Arr[2][1]=21;
		p.Arr[3][0]=3;
        p.Arr[3][1]=21;
       
		break;														
	}
	}
	
}
shape(shape s)
{
	p=new point();
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<2;j++)
		{
		p.Arr[i][j]=s.p.Arr[i][j];
		}
	}
	
	type=s.type;
	c_pos=s.c_pos;
	value=s.value;
	//rotate=s.rotate.clone();
}
boolean fun(int se,char m)
{
	if(m=='b') {
	for(int i=0;i<4;i++)
	{
		if(p.Arr[se][0]+1==p.Arr[i][0]&&p.Arr[se][1]==p.Arr[i][1])
			return true;
		
	}
	//System.out.println("from here");
	
}
	else if(m=='r')
	{
		for(int i=0;i<4;i++)
		{
			if(p.Arr[se][0]==p.Arr[i][0]&&p.Arr[se][1]+1==p.Arr[i][1])
				return true;
			
		}
		//System.out.println("from here");
		
	}
	else if(m=='l')
	{
		for(int i=0;i<4;i++)
		{
			if(p.Arr[se][0]==p.Arr[i][0]&&p.Arr[se][1]-1==p.Arr[i][1])
				return true;
			
		}
		//System.out.println("from here");
		
	}
	return false;
}
int change(char m,board b)
{
	if(c_pos==16)
		c_pos=0;
	int flag=0;
	int i;
	
	if(m=='b') 
	{
		
for(i=3;i>=0;i--) {
	 if(b.arr[(p.Arr[i][0])+1][p.Arr[i][1]]==' '|| fun(i,m)) {
	flag=0;
	}
else 
return 0;
}
for(i=3;i>=0;i--)
	p.Arr[i][0]=p.Arr[i][0]+1;
    }
	else if(m=='r') 
	{
		for(i=3;i>=0;i--) {
			 if(b.arr[(p.Arr[i][0])][p.Arr[i][1]+1]==' '|| fun(i,m)) {
			flag=0;
			}
		else 
		return 1;
		}
		for(i=3;i>=0;i--)
			p.Arr[i][1]=p.Arr[i][1]+1;
}

    
	else if(m=='l') 
	{
	

	for(i=3;i>=0;i--) {
		 if(b.arr[(p.Arr[i][0])][p.Arr[i][1]-1]==' '|| fun(i,m)) {
		flag=0;
		}
	else 
	return 1;
	}
	for(i=3;i>=0;i--)
		p.Arr[i][1]=p.Arr[i][1]-1;
	}
	else if(m=='p') {
		int a,t,c,d,e,f,g,h;
		int k=c_pos;
	
		a=p.Arr[0][0]+rotate[type][k+0][0];
	    t=p.Arr[0][1]+rotate[type][k+0][1];
	   if((t<b.max_col-2&&t>0)&&( a<b.max_row-1))
		 flag=0;
	   else
		return 1;
	   
	   c=p.Arr[1][0]+rotate[type][k+1][0];
	    d=p.Arr[1][1]+rotate[type][k+1][1];
		if((d<b.max_col-2&&d>0)&&( c<b.max_row-1))
			 flag=0;
		   else
          return 1;
		
	  e= p.Arr[2][0]+rotate[type][k+2][0];
	  f=p.Arr[2][1]+rotate[type][k+2][1];
		if((f<b.max_col-2&&f>0)&&( e<b.max_row-1))
			 flag=0;
		   else
			return 1;
		g= p.Arr[3][0]+rotate[type][k+3][0];
		  h=p.Arr[3][1]+rotate[type][k+3][1];
			if((h<b.max_col-2&&h>0)&&( g<b.max_row-1))
				 flag=0;
			   else
				return 1;
		 b.arr[p.Arr[0][0]][p.Arr[0][1]]=' ';
		 b.arr[p.Arr[1][0]][p.Arr[1][1]]=' ';
		 b.arr[p.Arr[2][0]][p.Arr[2][1]]=' ';
		 b.arr[p.Arr[3][0]][p.Arr[3][1]]=' ';
	     c_pos=k+4;
	     p.Arr[0][0]=a;
	     p.Arr[0][1]=t;
	     p.Arr[1][0]=c;
	     p.Arr[1][1]=d;
	     p.Arr[2][0]=e;
	     p.Arr[2][1]=f;
	     p.Arr[3][0]=g;
	     p.Arr[3][1]=h;
	    				
	     
	}
	

return 1;

}
}
