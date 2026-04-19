package com.revenuecat.purchases.common;

import ae.r;
import ae.s;
import android.content.Context;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import ie.g;
import ie.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import je.d;
import md.i0;
import xd.b;
import xd.n;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class FileHelper {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$readFilePerLines$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<BufferedReader, i0> {
        final /* synthetic */ l<g<String>, i0> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super g<String>, i0> lVar) {
            super(1);
            this.$block = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(BufferedReader bufferedReader) {
            invoke2(bufferedReader);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BufferedReader bufferedReader) {
            r.f(bufferedReader, "bufferedReader");
            this.$block.invoke(n.c(bufferedReader));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1, reason: invalid class name and case insensitive filesystem */
    static final class C05531 extends s implements l<g<? extends String>, i0> {
        final /* synthetic */ int $numberOfLinesToRemove;
        final /* synthetic */ StringBuilder $textToAppend;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05531(int i10, StringBuilder sb2) {
            super(1);
            this.$numberOfLinesToRemove = i10;
            this.$textToAppend = sb2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(g<? extends String> gVar) {
            invoke2((g<String>) gVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g<String> gVar) {
            r.f(gVar, "sequence");
            g gVarL = o.l(gVar, this.$numberOfLinesToRemove);
            StringBuilder sb2 = this.$textToAppend;
            Iterator it = gVarL.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append("\n");
            }
        }
    }

    public FileHelper(Context context) {
        r.f(context, "applicationContext");
        this.applicationContext = context;
    }

    private final File getFileInFilesDir(String str) {
        return new File(getFilesDir(), str);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        r.e(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String str, l<? super BufferedReader, i0> lVar) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(getFileInFilesDir(str));
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    lVar.invoke(bufferedReader);
                    i0 i0Var = i0.f15558a;
                    b.a(bufferedReader, null);
                    b.a(inputStreamReader, null);
                    b.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final void appendToFile(String str, String str2) throws IOException {
        r.f(str, "filePath");
        r.f(str2, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(str);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = str2.getBytes(d.f14191b);
            r.e(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            i0 i0Var = i0.f15558a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public final boolean deleteFile(String str) {
        r.f(str, "filePath");
        return getFileInFilesDir(str).delete();
    }

    public final boolean fileIsEmpty(String str) {
        r.f(str, "filePath");
        File fileInFilesDir = getFileInFilesDir(str);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String str) {
        r.f(str, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(str));
    }

    public final void readFilePerLines(String str, l<? super g<String>, i0> lVar) throws IOException {
        r.f(str, "filePath");
        r.f(lVar, "block");
        openBufferedReader(str, new AnonymousClass1(lVar));
    }

    public final void removeFirstLinesFromFile(String str, int i10) throws IOException {
        r.f(str, "filePath");
        StringBuilder sb2 = new StringBuilder();
        readFilePerLines(str, new C05531(i10, sb2));
        deleteFile(str);
        String string = sb2.toString();
        r.e(string, "textToAppend.toString()");
        appendToFile(str, string);
    }
}
