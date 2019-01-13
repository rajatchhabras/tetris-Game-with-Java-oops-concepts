package project;

import project.shape;

class board
{
	char arr[][];
	int max_row;
	int max_col;
	board(board c)
	{
		this.max_row=c.max_row;
		this.max_col=c.max_col;
		this.arr=new char[max_row][max_col];
		for(int i=0;i<max_row;i++)
		{
			for(int j=0;j<max_col;j++)
			{
				this.arr[i][j]=c.arr[i][j];
			}
		}
		
	}
	
	board(int x,int y)
	{
		max_row=x;
		max_col=y;
		arr=new char[max_row][max_col];
	}
	void minimize()
	{
		int flag=0,i;
		for(i=0;i<max_row;i++)
		{
			if(arr[i][max_col-1]=='P') {
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			for(int k=0;k<i;k++)
			{
				for(int j=1;j<max_col;j++)
					arr[i][j]=' ';
			}
		}
	}
	void clear()
	{
		int i,j;
		for(i=0;i<max_row;i++)
		{
			for(j=0;j<max_col-1;j++)
			{
				if(i==0||j==0||i==max_row-1||j==max_col-2)
				arr[i][j]='0';
				else
					arr[i][j]=' ';
			}
		}
	}
	void addingLast()
	{
		int count=0;
		for(int i=0;i<max_row;i++)
		{
			count=0;
			for(int j=0;j<max_col-1;j++)
			{
			 if(arr[i][j]=='*')
				 count++;
			}
			arr[i][max_col-1]=(char)(count+48);
		}
		
	}

	void print()
	{
		int i,j;
		for(i=0;i<max_row;i++)
		{
			for(j=0;j<max_col;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	void addShape(shape s)
	{
		 
	  arr[s.p.Arr[0][0]][s.p.Arr[0][1]]=s.value;
	  arr[s.p.Arr[1][0]][s.p.Arr[1][1]]=s.value;
	  arr[s.p.Arr[2][0]][s.p.Arr[2][1]]=s.value;
	  arr[s.p.Arr[3][0]][s.p.Arr[3][1]]=s.value;
	 }
	void still(shape s,char m)
	{
		if(m=='b') {
		 arr[s.p.Arr[0][0]-1][s.p.Arr[0][1]]=' ';
		  arr[s.p.Arr[1][0]-1][s.p.Arr[1][1]]=' ';
		  arr[s.p.Arr[2][0]-1][s.p.Arr[2][1]]=' ';
		  arr[s.p.Arr[3][0]-1][s.p.Arr[3][1]]=' ';
	}
		else if(m=='r') {
			 arr[s.p.Arr[0][0]][s.p.Arr[0][1]-1]=' ';
			  arr[s.p.Arr[1][0]][s.p.Arr[1][1]-1]=' ';
			  arr[s.p.Arr[2][0]][s.p.Arr[2][1]-1]=' ';
			  arr[s.p.Arr[3][0]][s.p.Arr[3][1]-1]=' ';
		}
		else if(m=='l') {
			 arr[s.p.Arr[0][0]][s.p.Arr[0][1]+1]=' ';
			  arr[s.p.Arr[1][0]][s.p.Arr[1][1]+1]=' ';
			  arr[s.p.Arr[2][0]][s.p.Arr[2][1]+1]=' ';
			  arr[s.p.Arr[3][0]][s.p.Arr[3][1]+1]=' ';
		}
			
	
}
}

