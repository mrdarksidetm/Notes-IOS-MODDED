package hf;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends i0, ReadableByteChannel {
    void B(c cVar, long j10);

    boolean F(long j10);

    String J();

    int K();

    byte[] O(long j10);

    long R(g0 g0Var);

    short V();

    long W();

    void b0(long j10);

    String c(long j10);

    c d();

    long d0();

    InputStream f0();

    f j(long j10);

    int m(x xVar);

    e peek();

    boolean q();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    long t();

    String u(long j10);
}
