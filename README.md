# gali-cricket-scoring
gali-cricket-scoring
Galli Cricket Scoring
      Develop a program to count the total runs scored by team in Galli cricket with below simple
rules:
 If batsman touch the ball he gets 1 run.
 If batsman fails to score run on two consecutive balls he gets out.
 Batsman can get out for other reasons like hit out, catch etc.
 if a batsman gets out for any reason, then team will lose 2 runs   
Program would have input as Number of balls bowled followed by either run scored for each
ball or it would be “W” if batsmen gets out for a ball. Please  use java &quot;Scanner&quot; to read inputs
from console.
    
 Sample   Example Input:
    5
    1
    1
    0
    W
    1
    Expected output:
    1
  Explanation:
  There were 5 balls bowled.
   1 run was scored in the first ball. Team score 1
   1 run was scored in the second ball. Team score 2
   0 run was scored in the third ball. Team score 2
   Wicket fell in the 4th ball. Deduct 2 runs from team score. Team score 0
  1 run was scored in the 5th ball. Team score 1
   
  Team score at the end 1
   
Example Input:
    4
    1
    0
    0
    W
    Expected output:
    -3

   There were 4 balls bowled.
   1 run was scored in the first ball. Team score 1
   0 run was scored in the second ball. Team score 1
   0 run was scored in the third ball.  As previous ball was also 0, batsmen is out. Deduct 2 runs
from team score. Team score -1
   Wicket fell in the 4th ball. Deduct 2 runs from team score. Team score -3
  Team score at the end -3
