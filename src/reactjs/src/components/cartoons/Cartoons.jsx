import React from 'react';

import '../../assets/css/style.css';
import '../../assets/css/cartoons/Cartoons.css';

import Cartoon from './Cartoon';
import Pagination from '../Pagination';

const Cartoons = () => {
    const cartoons = [
        <Cartoon />,
        <Cartoon />,
        <Cartoon />,
        <Cartoon />,
        <Cartoon />
    ];
    return (
        <div>
          <canvas className='cartoons-background' />
          <div className='container shadow bg-white'>
            <h2 className='title'>Cartoons</h2>
            <div className='movies'>
              {cartoons}
            </div>
            <Pagination />
          </div>
        </div>
    );
}

export default Cartoons;
