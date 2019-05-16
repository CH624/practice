package Miro;
import java.util.Random;

public class MAP {
	static final int b0[][]  = {
	        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	        {1,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1},
	        {1,1,1,1,1,1,1,3,3,1,1,1,3,3,1,1,1,1,1,1,1,1},
	        {1,1,1,1,1,1,3,3,3,3,1,3,3,3,3,1,1,1,1,1,1,1},
	        {1,1,1,1,1,1,3,3,3,3,3,3,3,3,3,1,1,1,1,1,1,1},
	        {1,1,1,1,1,1,1,3,3,3,3,3,3,3,1,1,1,1,1,1,1,1},
	        {1,1,1,1,1,1,1,1,3,3,3,3,3,1,1,1,1,1,1,1,1,1},
	        {1,1,1,1,1,1,1,1,1,3,3,3,1,1,1,1,1,1,1,1,1,1},
	        {1,1,2,1,1,1,1,1,1,1,3,1,1,1,1,1,1,1,1,2,1,1},
	        {1,1,1,1,1,1,1,1,1,1,5,1,1,1,1,1,1,1,1,1,1,1},
	        {1,1,1,1,1,1,1,1,1,1,5,1,1,1,1,1,1,1,1,1,1,1},
	        {1,1,1,1,1,1,2,0,0,0,4,0,0,0,0,3,1,1,1,1,1,1},
	        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	    };
	static final int b1[][]  = {
	        {3,0,0,1,1,1,1,1,1,0,5,0,1,1,1,0,0,0,0,0,0,1},
	        {0,1,1,0,0,0,0,0,0,0,1,0,1,0,1,1,0,1,1,1,0,1},
	        {0,1,0,0,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,0,0,1},
	        {0,1,1,0,0,1,0,1,0,1,0,0,1,0,1,1,1,1,0,1,1,1},
	        {0,4,0,0,1,1,0,1,0,1,1,1,1,0,1,0,0,0,0,1,0,1},
	        {1,1,1,0,0,0,0,0,0,1,0,0,0,1,1,0,1,1,0,1,0,0},
	        {0,1,0,0,1,1,1,1,1,1,0,1,0,0,0,0,1,1,0,0,1,0},
	        {0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,0,0},
	        {1,1,1,1,0,1,1,1,1,1,0,0,0,1,0,0,1,0,1,1,1,0},
	        {1,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1,1,0,0,0,1,0},
	        {1,0,1,1,1,1,0,1,0,1,1,0,0,0,1,0,0,0,1,0,1,0},
	        {1,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,0},
	        {1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,0,1,1,0},
	        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2}
	    };
	static final int b2[][]  = {
	        {3,1,0,1,1,1,1,0,0,0,1,0,4,1,1,1,0,0,0,0,0,0},
	        {0,1,0,1,0,0,0,0,1,0,1,0,1,0,4,0,1,1,1,0,1,0},
	        {5,1,0,4,1,1,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0},
	        {0,1,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
	        {5,1,4,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
	        {0,1,1,0,1,0,1,0,1,0,1,0,4,0,1,0,1,0,1,0,1,0},
	        {4,4,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
	        {1,4,1,0,1,0,4,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
	        {0,4,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
	        {4,1,4,0,1,0,1,0,1,0,4,0,1,0,1,0,1,0,1,0,1,0},
	        {0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
	        {0,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
	        {4,1,1,0,1,0,0,0,0,0,1,0,1,0,4,0,1,0,1,1,1,0},
	        {0,0,4,0,1,1,1,1,1,1,1,1,1,0,0,1,4,0,0,0,4,2}
	};
	static final int b3[][]  = {
			{3,1,1,5,5,0,4,4,1,1,5,1,1,0,5,5,1,4,4,4,1,1},
	        {5,5,1,1,5,1,1,5,1,1,5,0,1,5,1,0,1,5,1,5,4,1},
	        {0,1,4,4,4,1,0,5,1,1,4,1,1,5,1,4,4,0,1,1,1,0},
	        {4,5,5,1,1,1,1,5,1,4,4,4,0,5,1,1,1,5,1,0,4,1},
	        {4,1,1,5,5,5,0,4,1,0,1,1,1,1,1,5,5,0,4,5,1,0},
	        {4,1,1,0,1,1,1,5,1,0,1,1,0,0,4,5,1,1,1,0,4,1},
	        {1,4,4,5,1,4,0,5,1,4,1,4,5,1,1,1,1,4,4,5,1,0},
	        {0,1,1,0,1,1,1,0,0,5,1,1,5,1,4,5,1,5,1,4,4,1},
	        {5,1,1,4,4,0,5,1,1,4,5,0,4,5,1,0,1,5,1,1,1,0},
	        {5,0,5,4,0,1,1,1,1,1,1,1,1,1,1,0,1,5,5,0,4,1},
	        {5,1,1,1,0,1,0,5,5,4,1,0,1,5,1,5,1,0,1,1,1,0},
	        {0,5,5,5,5,1,4,1,1,4,1,4,4,0,4,5,1,4,4,4,4,4},
	        {0,1,4,1,5,1,4,1,1,4,5,0,1,0,1,0,0,4,1,1,1,5},
	        {1,1,4,1,5,4,4,1,1,1,1,1,1,5,1,5,1,4,1,5,5,2}
	};
}
