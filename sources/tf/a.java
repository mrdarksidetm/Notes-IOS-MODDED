package tf;

import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public class a implements tf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BitSet f21403a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BitSet f21404a;

        private b(BitSet bitSet) {
            this.f21404a = bitSet;
        }

        public a b() {
            return new a(this);
        }

        public b c(char c10) {
            if (c10 > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.f21404a.set(c10);
            return this;
        }

        public b d(char c10, char c11) {
            while (c10 <= c11) {
                c(c10);
                c10 = (char) (c10 + 1);
            }
            return this;
        }
    }

    private a(b bVar) {
        this.f21403a = bVar.f21404a;
    }

    public static b b() {
        return new b(new BitSet());
    }

    @Override // tf.b
    public boolean a(char c10) {
        return this.f21403a.get(c10);
    }

    public b c() {
        return new b((BitSet) this.f21403a.clone());
    }
}
