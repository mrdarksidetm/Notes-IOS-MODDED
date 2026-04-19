package ge;

import nd.r;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterable<Character>, be.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0275a f11521d = new C0275a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f11522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f11523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11524c;

    /* JADX INFO: renamed from: ge.a$a, reason: collision with other inner class name */
    public static final class C0275a {
        private C0275a() {
        }

        public /* synthetic */ C0275a(ae.j jVar) {
            this();
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f11522a = c10;
        this.f11523b = (char) ud.c.c(c10, c11, i10);
        this.f11524c = i10;
    }

    public final char l() {
        return this.f11522a;
    }

    public final char n() {
        return this.f11523b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public r iterator() {
        return new b(this.f11522a, this.f11523b, this.f11524c);
    }
}
