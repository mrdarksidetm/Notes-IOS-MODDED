package hf;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public interface d extends g0, WritableByteChannel {
    d D(long j10);

    long T(i0 i0Var);

    d c0(long j10);

    c d();

    @Override // hf.g0, java.io.Flushable
    void flush();

    d g(f fVar);

    d n();

    d s();

    d write(byte[] bArr);

    d write(byte[] bArr, int i10, int i11);

    d writeByte(int i10);

    d writeInt(int i10);

    d writeShort(int i10);

    d z(String str);
}
