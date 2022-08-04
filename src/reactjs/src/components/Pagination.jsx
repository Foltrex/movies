import React from 'react';

import '../assets/css/Pagination.css';

const Pagination = () => {
    return (
        <nav>
          <ul className='pagination content-pagination'>
            <li className='page-item'>
              <a className='page-link' href=''>&laquo;</a>
            </li>
            
            <li className='page-item'>
              <a className='page-link' href=''>1</a>
            </li>
            <li className='page-item'>
              <a className='page-link' href=''>2</a>
            </li>
            <li className='page-item'>
              <a className='page-link' href=''>3</a>
            </li>

            <li className='page-item'>
              <a className='page-link' href=''>&raquo;</a>
            </li>
        </ul>
        </nav>
    );
}

export default Pagination;
