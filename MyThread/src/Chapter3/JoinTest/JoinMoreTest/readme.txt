begin A ThreadName=Thread-1 1483333597582
  end A ThreadName=Thread-1 1483333602583
begin B ThreadName=Thread-0 1483333602583
  end B ThreadName=Thread-0 1483333607583
    main end1483333607583


join()方法后面的代码提前运行，会出现这个也会出现这个

    begin A ThreadName=Thread-1 1483333597582
      end A ThreadName=Thread-1 1483333602583
        main end1483333607583
    begin B ThreadName=Thread-0 1483333602583
      end B ThreadName=Thread-0 1483333607583
