// ========================================================================
// $Id: EOFException.java,v 1.3 2004/05/09 20:31:40 gregwilkins Exp $
// Copyright 1999-2004 Mort Bay Consulting Pty. Ltd.
// ------------------------------------------------------------------------
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at 
// http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// ========================================================================

package net.lightbody.bmp.proxy.jetty.http;
import java.io.IOException;


/* ------------------------------------------------------------ */
/** Exception for EOF detected. 
 *
 * @version $$
 * @author Greg Wilkins (gregw)
 */
public class EOFException extends IOException
{
    private IOException _ex;

    public IOException getTargetException()
    {
        return _ex;
    }
    
    
    public EOFException()
    {}
    
    public EOFException(IOException ex)
    {
        _ex=ex;
    }

    public String toString()
    {
        return "EOFException("+
            (_ex==null?"":(_ex.toString()))+
            ")";
    }
}
