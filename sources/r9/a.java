package r9;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19237a;

    private a(String str) {
        this.f19237a = (String) d.a(str);
    }

    public static a e(char c10) {
        return new a(String.valueOf(c10));
    }

    public <A extends Appendable> A a(A a10, Iterator<? extends Object> it) throws IOException {
        d.a(a10);
        if (it.hasNext()) {
            while (true) {
                a10.append(f(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a10.append(this.f19237a);
            }
        }
        return a10;
    }

    public final StringBuilder b(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String c(Iterable<? extends Object> iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator<? extends Object> it) {
        return b(new StringBuilder(), it).toString();
    }

    CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
