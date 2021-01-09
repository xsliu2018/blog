package com.xsl.blog.entity;

public class UserWithBLOBs extends User {
    private byte[] sslCipher;

    private byte[] x509Issuer;

    private byte[] x509Subject;

    private String authenticationString;

    private String userAttributes;

    public byte[] getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(byte[] sslCipher) {
        this.sslCipher = sslCipher;
    }

    public byte[] getX509Issuer() {
        return x509Issuer;
    }

    public void setX509Issuer(byte[] x509Issuer) {
        this.x509Issuer = x509Issuer;
    }

    public byte[] getX509Subject() {
        return x509Subject;
    }

    public void setX509Subject(byte[] x509Subject) {
        this.x509Subject = x509Subject;
    }

    public String getAuthenticationString() {
        return authenticationString;
    }

    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString == null ? null : authenticationString.trim();
    }

    public String getUserAttributes() {
        return userAttributes;
    }

    public void setUserAttributes(String userAttributes) {
        this.userAttributes = userAttributes == null ? null : userAttributes.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", x509Issuer=").append(x509Issuer);
        sb.append(", x509Subject=").append(x509Subject);
        sb.append(", authenticationString=").append(authenticationString);
        sb.append(", userAttributes=").append(userAttributes);
        sb.append("]");
        return sb.toString();
    }
}