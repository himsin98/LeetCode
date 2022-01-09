class Solution {

	public int[] dx = new int[]{0,1,0,-1};
	public int[] dy = new int[]{1,0,-1,0};

	public boolean isRobotBounded(String instructions) {

		int deltaIndex = 0;
		int currX = 0;
		int currY = 0;

		char[] instructions_ = instructions.toCharArray();

		for(int i=0;i<4;i++)
		{
			for(char ch : instructions_)
			{
				if(ch == 'G')
				{
					currX += dx[deltaIndex];
					currY += dy[deltaIndex];
				}
				else
				{
					deltaIndex = getCurrIndex(deltaIndex,ch);
				}
			}

			if(currX == 0 && currY == 0 && deltaIndex == 0)
				return true;   
		}
		return false;

	}

	public int getCurrIndex(int currDelta, char ch)
	{
		if(ch == 'R')
		{
			currDelta++;
		}
		else
		{
			currDelta--;
		}

		if(currDelta < 0)
		{
			currDelta = 3;
		}
		else if(currDelta > 3)
		{
			currDelta = 0;
		}

		return currDelta;
	}
}