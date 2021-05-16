//https://leetcode.com/problems/generate-random-point-in-a-circle/

class Solution {
    Random rand = new Random(); 
    double rad, centerx, centery;

    public Solution(double radius, double x_center, double y_center) {
        rad = radius;
        centerx = x_center;
        centery = y_center;
    }
    
    public double[] randPoint() {
        double[] ans = new double[2];
        do{
            ans[0] = (centerx-rad) + rand.nextDouble() * ((centerx+rad)-(centerx-rad));
            ans[1] = (centery-rad) + rand.nextDouble() * ((centery+rad)-(centery-rad));
            
        }while((ans[0] - centerx) * (ans[0] - centerx) + (ans[1] - centery) * (ans[1] - centery) > rad * rad);

        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
