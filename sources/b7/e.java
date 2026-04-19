package b7;

import ae.r;
import ae.s;
import nd.p;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    static final class a extends s implements l<Byte, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5522a = new a();

        a() {
            super(1);
        }

        public final CharSequence a(byte b10) {
            String str = String.format("%02x", Byte.valueOf(b10));
            r.e(str, "format(\"%02x\", it)");
            return str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b10) {
            return a(b10.byteValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(byte[] bArr) {
        return p.l0(bArr, "", null, null, 0, null, a.f5522a, 30, null);
    }
}
