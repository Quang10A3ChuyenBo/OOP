public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledSquare(0,0, 0.45);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(0, 0, 0.45);
        int x = 0, y = 0;
        int steps = 0;
        int[] dx = new int[5];
        int[] dy = new int[5];
        dx[1] = -1; dx[2] = 0; dx[3] = 1; dx[4] = 0;
        dy[1] = 0; dy[2] = -1; dy[3] = 0; dy[4] = 1;
        double cnt = 0.5;
        int dh = 0;
        int t=0;
        while (Math.abs(x) < n && Math.abs(y) < n) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(x, y, 0.45);
           /* double r = Math.random();
            if      (r < 0.25) x--;
            else if (r < 0.50) x++;
            else if (r < 0.75) y--;
            else if (r < 1.00) y++;*/
            if (dh == (int)cnt)
            {
                dh = 1;
                cnt = cnt + 0.5;
                t = t+1;
                if (t == 5) t = 1;
                x = x + dx[t];
                y = y + dy[t];
            }
            else
            {
                dh = dh+1;
                x = x + dx[t];
                y = y + dy[t];
            }
            steps++;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(5);
        }
        StdOut.println("Total steps = " + steps);
    }

}