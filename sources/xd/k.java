package xd;

import ae.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import je.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class k extends j {
    public static final File g(File file, File file2, boolean z10, int i10) throws IOException {
        r.f(file, "<this>");
        r.f(file2, "target");
        if (!file.exists()) {
            throw new m(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z10) {
                throw new e(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new e(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    a.a(fileInputStream, fileOutputStream, i10);
                    b.a(fileOutputStream, null);
                    b.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!file2.mkdirs()) {
            throw new f(file, file2, "Failed to create target directory.");
        }
        return file2;
    }

    public static /* synthetic */ File h(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return g(file, file2, z10, i10);
    }

    public static String i(File file) {
        r.f(file, "<this>");
        String name = file.getName();
        r.e(name, "getName(...)");
        return w.O0(name, com.amazon.a.a.o.c.a.b.f7490a, "");
    }

    public static final File j(File file, File file2) {
        r.f(file, "<this>");
        r.f(file2, "relative");
        if (h.b(file2)) {
            return file2;
        }
        String string = file.toString();
        r.e(string, "toString(...)");
        if ((string.length() == 0) || w.O(string, File.separatorChar, false, 2, null)) {
            return new File(string + file2);
        }
        return new File(string + File.separatorChar + file2);
    }

    public static File k(File file, String str) {
        r.f(file, "<this>");
        r.f(str, "relative");
        return j(file, new File(str));
    }
}
