package ee;

import ae.r;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends ee.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f10964c = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // ee.a
    public Random g() {
        Random random = this.f10964c.get();
        r.e(random, "get(...)");
        return random;
    }
}
