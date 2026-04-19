package hf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class s extends j {
    private final List<z> r(z zVar, boolean z10) throws IOException {
        File file = zVar.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                ae.r.e(str, "it");
                arrayList.add(zVar.p(str));
            }
            nd.y.A(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + zVar);
        }
        throw new FileNotFoundException("no such file: " + zVar);
    }

    private final void s(z zVar) throws IOException {
        if (j(zVar)) {
            throw new IOException(zVar + " already exists.");
        }
    }

    private final void t(z zVar) throws IOException {
        if (j(zVar)) {
            return;
        }
        throw new IOException(zVar + " doesn't exist.");
    }

    @Override // hf.j
    public g0 b(z zVar, boolean z10) throws IOException {
        ae.r.f(zVar, "file");
        if (z10) {
            t(zVar);
        }
        return u.f(zVar.toFile(), true);
    }

    @Override // hf.j
    public void c(z zVar, z zVar2) throws IOException {
        ae.r.f(zVar, "source");
        ae.r.f(zVar2, "target");
        if (zVar.toFile().renameTo(zVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + zVar + " to " + zVar2);
    }

    @Override // hf.j
    public void g(z zVar, boolean z10) throws IOException {
        ae.r.f(zVar, "dir");
        if (zVar.toFile().mkdir()) {
            return;
        }
        i iVarM = m(zVar);
        if (!(iVarM != null && iVarM.f())) {
            throw new IOException("failed to create directory: " + zVar);
        }
        if (z10) {
            throw new IOException(zVar + " already exist.");
        }
    }

    @Override // hf.j
    public void i(z zVar, boolean z10) throws IOException {
        ae.r.f(zVar, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = zVar.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + zVar);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + zVar);
        }
    }

    @Override // hf.j
    public List<z> k(z zVar) throws IOException {
        ae.r.f(zVar, "dir");
        List<z> listR = r(zVar, true);
        ae.r.c(listR);
        return listR;
    }

    @Override // hf.j
    public i m(z zVar) {
        ae.r.f(zVar, "path");
        File file = zVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new i(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // hf.j
    public h n(z zVar) {
        ae.r.f(zVar, "file");
        return new r(false, new RandomAccessFile(zVar.toFile(), "r"));
    }

    @Override // hf.j
    public g0 p(z zVar, boolean z10) throws IOException {
        ae.r.f(zVar, "file");
        if (z10) {
            s(zVar);
        }
        return v.g(zVar.toFile(), false, 1, null);
    }

    @Override // hf.j
    public i0 q(z zVar) {
        ae.r.f(zVar, "file");
        return u.j(zVar.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
