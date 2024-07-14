package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void searchTest() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.search(new int[]{4,5,6,7,0,1,2}, 0));
        Assert.assertEquals(-1, solution.search(new int[]{4,5,6,7,0,1,2}, 3));
        Assert.assertEquals(-1, solution.search(new int[]{1}, 0));
        Assert.assertEquals(4, solution.search(new int[]{4,5,6,7,8,1,2,3}, 8));
        Assert.assertEquals(0, solution.search(new int[]{5,1,3}, 5));
        Assert.assertEquals(0, solution.search(new int[]{6,7,1,2,3,4,5}, 6));
        Assert.assertEquals(4, solution.search(new int[]{4,7,9,1,2,3}, 2));
        Assert.assertEquals(-1, solution.search(new int[]{6,7,1,2,3,4,5}, 0));
        Assert.assertEquals(1, solution.search(new int[]{6,7,1,2,3,4,5}, 7));
    }

}