package okhttp3.internal.io;

import ae.r;
import hf.g0;
import hf.i0;
import hf.u;
import hf.v;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface FileSystem {

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17536a = new Companion();

        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public i0 a(File file) {
                r.f(file, "file");
                return u.j(file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public g0 b(File file) {
                r.f(file, "file");
                try {
                    return v.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return v.g(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void c(File file) throws IOException {
                r.f(file, "directory");
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(r.m("not a readable directory: ", file));
                }
                int i10 = 0;
                int length = fileArrListFiles.length;
                while (i10 < length) {
                    File file2 = fileArrListFiles[i10];
                    i10++;
                    if (file2.isDirectory()) {
                        r.e(file2, "file");
                        c(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException(r.m("failed to delete ", file2));
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean d(File file) {
                r.f(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void e(File file, File file2) throws IOException {
                r.f(file, "from");
                r.f(file2, "to");
                f(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void f(File file) throws IOException {
                r.f(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(r.m("failed to delete ", file));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public g0 g(File file) {
                r.f(file, "file");
                try {
                    return u.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return u.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long h(File file) {
                r.f(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    i0 a(File file);

    g0 b(File file);

    void c(File file);

    boolean d(File file);

    void e(File file, File file2);

    void f(File file);

    g0 g(File file);

    long h(File file);
}
