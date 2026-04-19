package hf;

import hf.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
public final class t extends s {
    private final Long u(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // hf.s, hf.j
    public void c(z zVar, z zVar2) throws IOException {
        ae.r.f(zVar, "source");
        ae.r.f(zVar2, "target");
        try {
            Files.move(zVar.q(), zVar2.q(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // hf.s, hf.j
    public i m(z zVar) {
        ae.r.f(zVar, "path");
        Path pathQ = zVar.q();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathQ, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathQ) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            z zVarF = symbolicLink != null ? z.a.f(z.f12027b, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lU = fileTimeCreationTime != null ? u(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lU2 = fileTimeLastModifiedTime != null ? u(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new i(zIsRegularFile, zIsDirectory, zVarF, lValueOf, lU, lU2, fileTimeLastAccessTime != null ? u(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // hf.s
    public String toString() {
        return "NioSystemFileSystem";
    }
}
