package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import w8.m;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ParcelFileDescriptor f8560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f8562d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8563e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f8564f;

    BitmapTeleporter(int i10, ParcelFileDescriptor parcelFileDescriptor, int i11) {
        this.f8559a = i10;
        this.f8560b = parcelFileDescriptor;
        this.f8561c = i11;
    }

    private static final void x(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("BitmapTeleporter", "Could not close stream", e10);
        }
    }

    public Bitmap u() {
        if (!this.f8563e) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) m.k(this.f8560b)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int i10 = dataInputStream.readInt();
                    int i11 = dataInputStream.readInt();
                    Bitmap.Config configValueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    x(dataInputStream);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, configValueOf);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
                    this.f8562d = bitmapCreateBitmap;
                    this.f8563e = true;
                } catch (IOException e10) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e10);
                }
            } catch (Throwable th) {
                x(dataInputStream);
                throw th;
            }
        }
        return this.f8562d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f8560b == null) {
            Bitmap bitmap = (Bitmap) m.k(this.f8562d);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            File file = this.f8564f;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.f8560b = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                        } catch (IOException e10) {
                            throw new IllegalStateException("Could not write into unlinked file", e10);
                        }
                    } finally {
                        x(dataOutputStream);
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e11) {
                throw new IllegalStateException("Could not create temporary file", e11);
            }
        }
        int iA = c.a(parcel);
        c.s(parcel, 1, this.f8559a);
        c.A(parcel, 2, this.f8560b, i10 | 1, false);
        c.s(parcel, 3, this.f8561c);
        c.b(parcel, iA);
        this.f8560b = null;
    }
}
