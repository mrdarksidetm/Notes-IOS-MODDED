package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h4.b f3863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f3864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f3865c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f3866d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f3867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m f3868b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f3867a = new SparseArray<>(i10);
        }

        a a(int i10) {
            SparseArray<a> sparseArray = this.f3867a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        final m b() {
            return this.f3868b;
        }

        void c(m mVar, int i10, int i11) {
            a aVarA = a(mVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f3867a.put(mVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(mVar, i10 + 1, i11);
            } else {
                aVarA.f3868b = mVar;
            }
        }
    }

    private l(Typeface typeface, h4.b bVar) {
        this.f3866d = typeface;
        this.f3863a = bVar;
        this.f3864b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(h4.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            m mVar = new m(this, i10);
            Character.toChars(mVar.f(), this.f3864b, i10 * 2);
            h(mVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            k3.g.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            k3.g.b();
        }
    }

    public char[] c() {
        return this.f3864b;
    }

    public h4.b d() {
        return this.f3863a;
    }

    int e() {
        return this.f3863a.l();
    }

    a f() {
        return this.f3865c;
    }

    Typeface g() {
        return this.f3866d;
    }

    void h(m mVar) {
        n3.g.i(mVar, "emoji metadata cannot be null");
        n3.g.b(mVar.c() > 0, "invalid metadata codepoint length");
        this.f3865c.c(mVar, 0, mVar.c() - 1);
    }
}
