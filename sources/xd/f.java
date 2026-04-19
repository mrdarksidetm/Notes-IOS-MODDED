package xd;

import ae.r;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class f extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f23135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f23136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(File file, File file2, String str) {
        super(c.b(file, file2, str));
        r.f(file, "file");
        this.f23135a = file;
        this.f23136b = file2;
        this.f23137c = str;
    }
}
