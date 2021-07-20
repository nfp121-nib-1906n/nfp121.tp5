package question1;

public class EnsembleTest extends junit.framework.TestCase {

	public void testUnion() {
		question1.Ensemble<Integer> e1, e2;
		e1 = new question1.Ensemble<Integer>();
		assertEquals(true, e1.add(2));
		assertEquals(true, e1.add(3));

		e2 = new question1.Ensemble<Integer>();
		assertEquals(true, e2.add(3));
		assertEquals(true, e2.add(4));

		question1.Ensemble<Integer> union = e1.union(e2);
		assertEquals(3, union.size());
		assertTrue(union.contains(2));
		assertTrue(union.contains(3));
		assertTrue(union.contains(4));
	}
	
        public void testAdd(){
        question1.Ensemble<Integer> e1 = new question1.Ensemble<Integer>();
        assertTrue(e1.add(102));
        assertTrue(e1.add(250));
        assertTrue(e1.add(321));

        assertEquals(3, e1.size());

        assertFalse(e1.add(250));

        assertEquals(3, e1.size());
    }

   
    public void testInter() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(20));
        assertEquals(true, e1.add(21));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(20));
        assertEquals(true, e2.add(21));
        assertEquals(true, e2.add(22));

        question1.Ensemble<Integer> inter = e1.inter(e2);
        assertEquals(2, inter.size());
        assertTrue(inter.contains(20));
        assertTrue(inter.contains(21));
        assertFalse(inter.contains(22));
    }


    public void testDiff() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(20));
        assertEquals(true, e1.add(23));
        assertEquals(true, e1.add(33));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(43));
        assertEquals(true, e2.add(63));

        question1.Ensemble<Integer> diff = e1.diff(e2);
        assertEquals(2, diff.size());
        assertTrue(diff.contains(20));
        assertTrue(diff.contains(23));
        assertFalse(diff.contains(43));
        assertFalse(diff.contains(63));
    }

 
    public void testDiffSym() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(80));
        assertEquals(true, e1.add(81));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(80));
        assertEquals(true, e2.add(103));

        question1.Ensemble<Integer> diffSym = e1.diffSym(e2);
        assertEquals(2, diffSym.size());
        assertTrue(diffSym.contains(81));
        assertTrue(diffSym.contains(103));
        assertFalse(diffSym.contains(80));
    }

    
    public void testToString(){
        question1.Ensemble<Integer> e1;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(19));
        assertEquals(true, e1.add(91));
        assertEquals("[19, 91]", e1.toString());
    }

	
}
