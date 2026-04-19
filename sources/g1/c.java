package g1;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.HashMap;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<o, String> f11262a = r0.g(x.a(o.EmailAddress, "emailAddress"), x.a(o.Username, URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), x.a(o.Password, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD), x.a(o.NewUsername, "newUsername"), x.a(o.NewPassword, "newPassword"), x.a(o.PostalAddress, "postalAddress"), x.a(o.PostalCode, "postalCode"), x.a(o.CreditCardNumber, "creditCardNumber"), x.a(o.CreditCardSecurityCode, "creditCardSecurityCode"), x.a(o.CreditCardExpirationDate, "creditCardExpirationDate"), x.a(o.CreditCardExpirationMonth, "creditCardExpirationMonth"), x.a(o.CreditCardExpirationYear, "creditCardExpirationYear"), x.a(o.CreditCardExpirationDay, "creditCardExpirationDay"), x.a(o.AddressCountry, "addressCountry"), x.a(o.AddressRegion, "addressRegion"), x.a(o.AddressLocality, "addressLocality"), x.a(o.AddressStreet, "streetAddress"), x.a(o.AddressAuxiliaryDetails, "extendedAddress"), x.a(o.PostalCodeExtended, "extendedPostalCode"), x.a(o.PersonFullName, "personName"), x.a(o.PersonFirstName, "personGivenName"), x.a(o.PersonLastName, "personFamilyName"), x.a(o.PersonMiddleName, "personMiddleName"), x.a(o.PersonMiddleInitial, "personMiddleInitial"), x.a(o.PersonNamePrefix, "personNamePrefix"), x.a(o.PersonNameSuffix, "personNameSuffix"), x.a(o.PhoneNumber, "phoneNumber"), x.a(o.PhoneNumberDevice, "phoneNumberDevice"), x.a(o.PhoneCountryCode, "phoneCountryCode"), x.a(o.PhoneNumberNational, "phoneNational"), x.a(o.Gender, "gender"), x.a(o.BirthDateFull, "birthDateFull"), x.a(o.BirthDateDay, "birthDateDay"), x.a(o.BirthDateMonth, "birthDateMonth"), x.a(o.BirthDateYear, "birthDateYear"), x.a(o.SmsOtpCode, "smsOTPCode"));

    public static final String a(o oVar) {
        String str = f11262a.get(oVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}
