package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
class k {

    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f3860a;

        a(ByteBuffer byteBuffer) {
            this.f3860a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.k.c
        public int a() {
            return this.f3860a.getInt();
        }

        @Override // androidx.emoji2.text.k.c
        public void b(int i10) {
            ByteBuffer byteBuffer = this.f3860a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.k.c
        public long c() {
            return k.c(this.f3860a.getInt());
        }

        @Override // androidx.emoji2.text.k.c
        public long getPosition() {
            return this.f3860a.position();
        }

        @Override // androidx.emoji2.text.k.c
        public int readUnsignedShort() {
            return k.d(this.f3860a.getShort());
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f3861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f3862b;

        b(long j10, long j11) {
            this.f3861a = j10;
            this.f3862b = j11;
        }

        long a() {
            return this.f3861a;
        }
    }

    private interface c {
        int a();

        void b(int i10);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) throws IOException {
        long jC;
        cVar.b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iA = cVar.a();
            cVar.b(4);
            jC = cVar.c();
            cVar.b(4);
            if (1835365473 == iA) {
                break;
            }
            i10++;
        }
        if (jC != -1) {
            cVar.b((int) (jC - cVar.getPosition()));
            cVar.b(12);
            long jC2 = cVar.c();
            for (int i11 = 0; i11 < jC2; i11++) {
                int iA2 = cVar.a();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static h4.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return h4.b.h(byteBufferDuplicate);
    }

    static long c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
