package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ORBPortInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Friday, April 10, 2015 11:30:48 AM PDT
*/

public final class ORBPortInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String orbId = null;
  public int port = (int)0;

  public ORBPortInfo ()
  {
  } // ctor

  public ORBPortInfo (String _orbId, int _port)
  {
    orbId = _orbId;
    port = _port;
  } // ctor

} // class ORBPortInfo
