String output = new File( basedir, "build.log" ).text;

assert output =~ "ansible -c local -m ping -Z who knows localhost"
