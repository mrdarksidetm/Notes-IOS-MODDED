package f6;

import j6.m;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11159a;

    public a(boolean z10) {
        this.f11159a = z10;
    }

    @Override // f6.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(File file, m mVar) {
        if (!this.f11159a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
