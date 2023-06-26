package exercises;

// TAGS System.out.println()

/* DESCRIPTION
// From RB Whitaker's "C# Player's Guide" - adjusted to Java

The man, who tells you his name is Ritlin, asks you to follow him over to a few of his
friends, fishing on the dock. “This one here has the makings of a Programmer!” Ritlin
says. The group looks at you with eyes widening and mouths agape. Ritlin turns back to
you and continues, “I haven’t seen nor heard tell of anybody who can wield that power
in a million clock cycles of the CPU. Nobody has been able to do that since the
Uncoded One showed up in these lands.” He describes the shadowy and mysterious Uncoded
One, an evil power that rots programs and perhaps even the world itself. The Uncoded
One’s presence has prevented anybody from wielding the power of programming, the only
thing that might be able to stop it. Yet somehow, you have been able to grab hold of
this power anyway. Ritlin’s companions suddenly seem doubtful. “Can you show them what
you showed me? Use some of that Programming of yours to make a program? Maybe
something with more than one statement in it?”
Objectives:
Make a program with 5 System.out.println statements in it.
Answer this question: How many statements do you think a program can contain?
To study if you find this difficult yet:
W3 schools Java Output/Print
 */

public class TheMakingsOfAProgrammer {
    public static void main(String[] args) {
        System.out.println("The first Chinese element is fire: it originates from wood, and produces earth.");
        System.out.println("The second Chinese element is earth: it originates from fire, and produces metal.");
        System.out.println("The third Chinese element is metal: it originates from earth, and produces water (by consensation on a mirror and such).");
        System.out.println("The fourth Chinese element is water: it originates from metal, and produces wood.");
        System.out.println("The fifth Chinese element is wood: it originates from water, and produces fire.");
    }
    // of course a program can contain an infinite amount of statements, though most companies stop at a few million :)
    // the largest may be of the Human Genome Project, which took about 3.3.10^12 lines of code
    // (https://www.quora.com/What-is-the-biggest-program-lines-of-code-ever-made#:~:text=Well%2C%20the%20largest%20program%20ever,3300%20billion%20lines%20of%20code.
    // That being said: in my experience, scientists are often not very good programmers, and they rarely collaborate or
    // communicate, so there is likely to be lots of superfluous and duplicate code
    // in such a codebase. Still, programs can be huge (in industry, usually you work on codebases between 10,000s and
    // 100,000s of lines, bigger than that is usually split up over multiple programs
}
