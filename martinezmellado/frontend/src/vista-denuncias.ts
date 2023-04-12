import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-denuncias_item';

@customElement('vista-denuncias')
export class VistaDenuncias extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vista-denuncias_item style="height: 20%;"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%;"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%;"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%;"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%;"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%;"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%;"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%;"></vista-denuncias_item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
