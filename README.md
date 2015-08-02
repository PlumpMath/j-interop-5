j-Interop is a Java Open Source library (under EPLv1.0) that
implements the DCOM wire protocol (MSRPC) to enable development of
Pure, Bi-Directional, Non-Native Java applications which can
interoperate with any COM component.

The implementation is itself purely in Java and does not use Java
Native Interface (JNI) to provide COM access. This allows the library
to be used from any Non-Windows platform.

It comes with pre-implemented packages for automation. This includes
support for IDispatch, ITypeInfo, and ITypeLib. For more flexibility
(in the cases where automation is not supported), it provides an API
set to directly invoke operations on a COM server.

Another important feature is allowing full access and manipulation
(C-R-U-D) of the Windows Registry in a platform independent manner.

The implementation has been tested on all advanced Windows and Fedora
platform(s) and displays upward compatibility from JRE 6.0.
