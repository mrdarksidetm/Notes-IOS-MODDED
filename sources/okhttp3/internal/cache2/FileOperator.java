package okhttp3.internal.cache2;

import ae.r;
import hf.c;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class FileOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f17112a;

    public FileOperator(FileChannel fileChannel) {
        r.f(fileChannel, "fileChannel");
        this.f17112a = fileChannel;
    }

    public final void a(long j10, c cVar, long j11) throws IOException {
        r.f(cVar, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferTo = this.f17112a.transferTo(j10, j11, cVar);
            j10 += jTransferTo;
            j11 -= jTransferTo;
        }
    }

    public final void b(long j10, c cVar, long j11) throws IOException {
        r.f(cVar, "source");
        if (j11 < 0 || j11 > cVar.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferFrom = this.f17112a.transferFrom(cVar, j10, j11);
            j10 += jTransferFrom;
            j11 -= jTransferFrom;
        }
    }
}
